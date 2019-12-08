package com.abeldevelop.blog.service.controller.v1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.abeldevelop.blog.api.v1.CategoryApi;
import com.abeldevelop.blog.dto.categories.CategoryPaginationResponseResource;
import com.abeldevelop.blog.dto.categories.CategoryResponseResource;
import com.abeldevelop.blog.dto.categories.CategorySort;
import com.abeldevelop.blog.dto.categories.CreateCategoryRequestResource;
import com.abeldevelop.blog.dto.categories.UpdateCategoryRequestResource;

@RestController
@RequestMapping("/v1/categories")
public class CategoryApiController implements CategoryApi {

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponseResource executeCreate(@RequestBody CreateCategoryRequestResource createCategoryRequestResource) {
        return null;
    }

    @Override
    @PutMapping("/{code}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponseResource executeUpdate(@PathVariable("code") String code, @RequestBody UpdateCategoryRequestResource updateCategoryRequestResource) {
        return null;
    }

    @Override
    @DeleteMapping("/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void executeDelete(@PathVariable("code") String code) {
        
    }

    @Override
    @GetMapping("/{code}")
    @ResponseStatus(HttpStatus.OK)
    public CategoryResponseResource executeFindByCode(@PathVariable("code") String code) {
        return null;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public CategoryPaginationResponseResource executeFindAll(
            @RequestParam(name = "page", required = false) Integer page, 
            @RequestParam(name = "size", required = false) Integer size, 
            @RequestParam(name = "sort", required = false) CategorySort sort, 
            @RequestParam(name = "query", required = false) String query) {
        return null;
    }

}
