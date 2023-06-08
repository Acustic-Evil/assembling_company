package acustic.assembling_company.service;

import acustic.assembling_company.entity.Goods;
import acustic.assembling_company.repository.IGoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    IGoodsRepository goodsRepository;

    public List<Goods> getAllGoods() {
        return goodsRepository.findAll();
    }
}
