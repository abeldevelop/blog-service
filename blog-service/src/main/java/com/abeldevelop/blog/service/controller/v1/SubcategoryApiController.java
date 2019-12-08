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

import com.abeldevelop.blog.api.v1.SubcategoryApi;
import com.abeldevelop.blog.dto.subcategories.CreateSubcategoryRequestResource;
import com.abeldevelop.blog.dto.subcategories.SubcategoryPaginationResponseResource;
import com.abeldevelop.blog.dto.subcategories.SubcategoryResponseResource;
import com.abeldevelop.blog.dto.subcategories.SubcategorySort;
import com.abeldevelop.blog.dto.subcategories.UpdateSubcategoryRequestResource;

@RestController
@RequestMapping("/v1/subcategories")
public class SubcategoryApiController implements SubcategoryApi {

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SubcategoryResponseResource executeCreate(@RequestBody CreateSubcategoryRequestResource createSubcategoryRequestResource) {
        return null;
    }

    @Override
    @PutMapping("/{code}")
    @ResponseStatus(HttpStatus.OK)
    public SubcategoryResponseResource executeUpdate(@PathVariable("code") String code, @RequestBody UpdateSubcategoryRequestResource updateSubcategoryRequestResource) {
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
    public SubcategoryResponseResource executeFindByCode(@PathVariable("code") String code) {
        return null;
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public SubcategoryPaginationResponseResource executeFindAll(
            @RequestParam(name = "page", required = false) Integer page, 
            @RequestParam(name = "size", required = false) Integer size, 
            @RequestParam(name = "sort", required = false) SubcategorySort sort, 
            @RequestParam(name = "query", required = false) String query) {
        return null;
    }

}
