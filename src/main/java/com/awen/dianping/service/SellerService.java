package com.awen.dianping.service;

import com.awen.dianping.common.BusinessException;
import com.awen.dianping.model.SellerModel;

import java.util.List;

/**
 * @author Liu Awen
 * @create 2020-05-05 21:57
 */
public interface SellerService {
    SellerModel create(SellerModel sellerModel);
    SellerModel get(Integer id);
    List<SellerModel> selectAll();
    SellerModel changeStatus(Integer id,Integer disabledFlag) throws BusinessException;

    Integer countAllSeller();
}
