package com.vsu.amm.medframe.service.impl;

import com.vsu.amm.medframe.component.mapper.impl.TestMapper;
import com.vsu.amm.medframe.component.mapper.impl.TestPointMapper;
import com.vsu.amm.medframe.dto.PatientDto;
import com.vsu.amm.medframe.dto.TestDto;
import com.vsu.amm.medframe.dto.TestPointDto;
import com.vsu.amm.medframe.entity.Test;
import com.vsu.amm.medframe.repository.TestPointRepository;
import com.vsu.amm.medframe.repository.TestRepository;
import com.vsu.amm.medframe.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    private static final Logger LOGGER = Logger.getLogger(TestServiceImpl.class);

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private TestPointRepository testPointRepository;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestPointMapper testPointMapper;

    @Override
    public TestDto save(TestDto testDto) {
        Test test = testMapper.mapToEntity(testDto);
        test = testRepository.save(test);
        return testMapper.mapToDto(test);
    }

    @Override
    public TestDto getTestById(Long id) {
        LOGGER.info("id = " + id.toString());
        return testMapper.mapToDto(testRepository.findOne(id));
    }

    @Override
    public void deleteTest(Long id) {

    }

    @Override
    public List<TestDto> getAllPatientsTests(PatientDto patient) {
        return null;
    }

    @Override
    public List<TestDto> getAll() {
        List<Test> tests = testRepository.findAll();
        return testMapper.mapToDto(tests);
    }

    @Override
    public TestPointDto save(TestPointDto testPointDto) {
        return null;
    }

    @Override
    public TestPointDto getTestPointById(Long id) {
        return null;
    }

    @Override
    public void deletePoint(Long id) {

    }
}
