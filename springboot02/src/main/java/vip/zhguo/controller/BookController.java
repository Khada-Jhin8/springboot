package vip.zhguo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vip.zhguo.pojo.Book;
import vip.zhguo.service.IBookService;
import vip.zhguo.util.ResultDto;
import vip.zhguo.util.Result_Code;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    IBookService bookService;

    @GetMapping
    public ResultDto getBooks() {
        return new ResultDto(Result_Code.success, bookService.list());
    }

    @PostMapping
    public ResultDto insertBook(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        if (flag) return new ResultDto(Result_Code.success, null);
        return new ResultDto(Result_Code.fail, null);
    }

    @PutMapping
    public ResultDto updateBook(@RequestBody Book book) {
        boolean flag = bookService.updateById(book);
        if (flag) return new ResultDto(Result_Code.success, null);
        return new ResultDto(Result_Code.fail, null);
    }

    @DeleteMapping("/{id}")
    public ResultDto deleteBook(@PathVariable Integer id) {
        boolean flag = bookService.removeById(id);
        if (flag) return new ResultDto(Result_Code.success, null);
        return new ResultDto(Result_Code.fail, null);
    }
    @GetMapping("/{id}")
    public ResultDto getBookById(@PathVariable Integer id){
        Book book = bookService.getById(id);
        if (book != null) return new ResultDto(Result_Code.success,book);
        return new ResultDto(Result_Code.fail,null);
    }
}
