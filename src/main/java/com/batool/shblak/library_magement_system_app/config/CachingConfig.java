package com.batool.shblak.library_magement_system_app.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableCaching
public class CachingConfig {

    public static final String BOOKS_CACHE_NAME = "books";

    public static final String PATRONS_CACHE_NAME = "patrons";
}
