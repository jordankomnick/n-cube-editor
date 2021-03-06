package com.cedarsoftware.controller

import com.cedarsoftware.ncube.ApplicationID
import com.cedarsoftware.ncube.NCubeManager
import groovy.transform.CompileStatic
import org.junit.AfterClass
import org.junit.BeforeClass
import org.junit.Ignore

@CompileStatic
class TestVisualizer {

    static NCubeController nCubeController

    @BeforeClass
    static void setUp()
    {
        nCubeController = new NCubeController()
        List ncubeNames = [
                'sys.classpath.json',
                'sys.prototype.json',
                'rpm.class.Coverage.json',
                'rpm.class.Limit.json',
                'rpm.class.Premium.json',
                'rpm.enum.Coverage.Limits.json',
                'rpm.enum.Coverage.Premiums.json',
                'rpm.scope.class.Coverage.classTraits.json',
                'rpm.scope.class.Coverage.traits.json',
                'rpm.scope.class.Limit.classTraits.json',
                'rpm.scope.class.Limit.traits.json',
                'rpm.scope.class.Premium.classTraits.json',
                'rpm.scope.class.Premium.traits.json',
                'rpm.scope.enum.Coverage.Limits.classTraits.json',
                'rpm.scope.enum.Coverage.Limits.traits.json',
                'rpm.scope.enum.Coverage.Premiums.classTraits.json',
                'rpm.scope.enum.Coverage.Premiums.traits.json'
        ]
        TestingNCubeManagerHelper.setupEnvironment()
        TestingNCubeManagerHelper.loadCubes(ncubeNames)
    }

    @AfterClass
    static void tearDown()
    {
        NCubeManager.clearCache()
    }

    // TODO: Need to bring over HSQL support (now that we have checkPermissions, those APIs fail because there is no connection - in NCE testing)
    @Ignore
    void testGetVisualizerJson()
    {
        Map options = [startCubeName: 'rpm.class.Coverage', scope: [coverage: 'MockCoverage1']]
        Map visualize = nCubeController.getVisualizerJson(ApplicationID.testAppId, options)
        println visualize
    }
}