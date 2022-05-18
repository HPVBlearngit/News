/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.controller;

import com.example.WebsiteTinTucTheThao.model.NguoiDungModel;
import com.example.WebsiteTinTucTheThao.service.NguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dovan
 */
@RestController
@RequestMapping("/api/tai-khoan")
public class NguoiDungController {
    @Autowired
    NguoiDungService nguoiDungService;
    
    @GetMapping("{id}")
    public NguoiDungModel getNguoiDungTheoId(@PathVariable Integer id){
        NguoiDungModel nguoiDung = nguoiDungService.findById(id).get();
        return nguoiDung;
    }
}
