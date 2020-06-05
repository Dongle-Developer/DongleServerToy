package com.dongle.toy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/KotlinSampleController")
class KotlinSampleController {
    @GetMapping
    fun get(): String = "Hello World"
}