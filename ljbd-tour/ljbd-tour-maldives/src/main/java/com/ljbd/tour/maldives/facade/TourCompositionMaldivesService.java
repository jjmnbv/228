package com.ljbd.tour.maldives.facade;

import com.ljbd.tour.maldives.model.TourCompositionMaldives;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TourCompositionMaldivesService {

    /*
     * 获取马尔代夫首页数据
     * */
    public List<TourCompositionMaldives> getTourCompositionMaldives4Master();

}
