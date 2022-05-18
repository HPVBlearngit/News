/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.WebsiteTinTucTheThao.service;

import com.example.WebsiteTinTucTheThao.model.NguoiDungModel;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author dovan
 */
public interface NguoiDungService {

    long count();

    void delete(NguoiDungModel entity);

    void deleteAll();

    void deleteAll(List<NguoiDungModel> entities);

    void deleteAllById(List<Integer> ids);

    void deleteById(Integer id);

    boolean existsById(Integer id);

    List<NguoiDungModel> findAll();

    List<NguoiDungModel> findAllById(List<Integer> ids);

    Optional<NguoiDungModel> findById(Integer id);

    NguoiDungModel save(NguoiDungModel entity);

    List<NguoiDungModel> saveAll(List<NguoiDungModel> entities);

    
}
