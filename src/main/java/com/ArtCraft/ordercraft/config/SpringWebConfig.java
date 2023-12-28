package com.ArtCraft.ordercraft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ArtCraft.ordercraft.controller")
public class SpringWebConfig {
}
