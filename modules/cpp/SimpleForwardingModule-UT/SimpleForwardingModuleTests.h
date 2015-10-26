//
// Created by zsdn on 6/25/15.
//

#ifndef DEMO_MODULE_UT_SWITCH_ADAPTER_TESTS_H
#define DEMO_MODULE_UT_SWITCH_ADAPTER_H

#include <cppunit/TestCase.h>
#include <cppunit/extensions/HelperMacros.h>

using namespace CppUnit;

class SimpleForwardingModuleTests : public CppUnit::TestCase {
    CPPUNIT_TEST_SUITE(SimpleForwardingModuleTests);
        CPPUNIT_TEST(testMethod1);
        CPPUNIT_TEST(testMethod2);
        CPPUNIT_TEST(testMethod3);
        CPPUNIT_TEST_SUITE_END();

public:
    int i = 5;
    SimpleForwardingModuleTests();
    void testMethod1();
    void testMethod2();
    void testMethod3();

};
#endif //DEMO_MODULE_UT_SWITCH_ADAPTER_H
