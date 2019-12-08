package com.abeldevelop.blog.dto.subcategories;

public enum SubcategorySort {

    NAME_DESC("NAME_DESC");
    
    private String value;
    
    private SubcategorySort(String value) {
        this.value = value;
    }
    
    public String getSort() {
        return value;
    }
    
}
