package com.ljbd.tour.maldives.service;

import com.ljbd.tour.maldives.dao.TourCompositionMaldivesDao;
import com.ljbd.tour.maldives.dao.TourDetailMaldivesDao;
import com.ljbd.tour.maldives.facade.TourCompositionMaldivesService;
import com.ljbd.tour.maldives.manager.TourCompositionMaldivesManager;
import com.ljbd.tour.maldives.model.TourCompositionMaldives;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TourCompositionMaldivesServiceImpl implements TourCompositionMaldivesService {
    @Resource
    private TourCompositionMaldivesManager tourCompositionMaldivesManager;
    @Resource
    private TourCompositionMaldivesDao tourCompositionMaldivesDao;

    @Override
    public List<TourCompositionMaldives> getTourCompositionMaldives4Master() {
        List<TourCompositionMaldives> result = tourCompositionMaldivesDao.findAll();
        return result;
    }
}
