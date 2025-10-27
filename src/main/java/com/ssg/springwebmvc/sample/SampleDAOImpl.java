package com.ssg.springwebmvc.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

// 느슨한 결합
@Repository
@Qualifier("basic")
public class SampleDAOImpl implements SampleDAO {
}
