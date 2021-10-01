package com.company;

public enum Category {
    BEAUTY(1),
    BOOKS(2),
    SOFTWARE(3);

    private final int code;

    public int getCode() {
        return code;
    }

    private Category(int code) {
        this.code = code;
    }

    public static Category getCategoryByCode(int code) {
        for (Category category : values()) {
            if (category.getCode() == code) {
                return category;
            }
        }
        return null;
    }


}
