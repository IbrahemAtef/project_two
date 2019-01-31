/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Doctor
 */
public class Project_two_tests {

    public Project_two_tests() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testTranspose() {
        int[][] m = {{30, 88},
        {57, 12},
        {32, 95},
        {93, 13},
        {33, 28}};
        int[][] result = {{30, 57, 32, 93, 33},
        {88, 12, 95, 13, 28}};
        assertArrayEquals(result, project_two.Project_two.Transpose(m, m.length, m[0].length));
    }

    @Test
    public void testSUBT() {
        int[][] A = {{68, 64, 3, 9},
         {49, 58, 29, 37},
         {32, 98, 33, 66},
         {98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40},
         {21, 98, 33, 19},
         {53, 36, 5, 62},
         {37, 7, 21, 76}};
        int[][] result = {{-23, 4, -25, -31},
         {28, -40, -4, 18},
         {-21, 62, 28, 4},
         {61, 31, 23, -49}};
        assertArrayEquals(result, project_two.Project_two.SUBT(A, B));
    }
    @Test
    public void testSUM_A_B(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{159, 124, 31, 49}
                        ,{70, 156, 62, 56}
                        ,{85, 134, 38, 128}
                        ,{135, 45, 65, 103}};
        assertArrayEquals(result, project_two.Project_two.SUM(A, B));
        
    }
    @Test
    public void testMUL(){
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        int[][] B = {{91, 60, 28, 40}
                    ,{21, 98, 33, 19}
                    ,{53, 36, 5, 62}
                    ,{37, 7, 21, 76}};
        int[][] result = {{8024, 10523, 4220, 4806}
                        ,{8583, 9927, 4208, 7672}
                        ,{9161, 13174, 5681, 10204}
                        ,{13047, 11377, 4785, 9422}};
        assertArrayEquals(result, project_two.Project_two.MUL(A, B));
    }
    @Test
    public void testDet5by5() {
        int[][] A = {{1, 2, 3, 4, 5}
                    ,{6, 7, 8, 9, 10}
                    ,{11, 12, 13, 14, 15}
                    ,{16, 17, 18, 19, 20}
                    ,{21, 22, 23, 24, 25}};
        assertEquals(0,project_two.Project_two.Det(A));
        
    }
    @Test
    public void testDet4by4() {
        int[][] A = {{68, 64, 3, 9}
                    ,{49, 58, 29, 37}
                    ,{32, 98, 33, 66}
                    ,{98, 38, 44, 27}};
        assertEquals(-329936,project_two.Project_two.Det(A));
        
    }
    @Test
    public void testDet3by3() {
        int[][] A = {{1, 2, 3}
                    ,{4, 5, 6}
                    ,{7, 8, 9}};
        assertEquals(0,project_two.Project_two.Det(A));
    }
    @Test
    public void testDet2by2() {
        int[][] A = {{1, 2}
                    ,{3, 4}};
        assertEquals(-2,project_two.Project_two.Det(A));
    }
    @Test
    public void testDet1by1() {
        int[][] A = {{100}};
        assertEquals(100,project_two.Project_two.Det(A));
    }
    @Test
    public void testSum(){
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        int[][] result = {{0, 0, 0},
                          {0, 0, 0},
                          {0, 0, 0}};
        assertArrayEquals(result, project_two.Project_two.SUM(A, B));
        }
    @Test
    public void testSubt(){
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        
        int[][] result = {{0, 0, 0},
                          {0, 0, 0},
                          {0, 0, 0}};
        assertArrayEquals(result, project_two.Project_two.SUBT(A, B));
    }
    @Test
    public void test2Mul(){
        int[][] A = {{91, 26, 75, 98, 86}};
        int[][] B = {{30, 88},
                     {57, 12},
                     {32, 95},
                     {93, 13},
                     {33, 28}};
        int[][] result = {{18564, 19127}};
        assertArrayEquals(result, project_two.Project_two.MUL(A, B));
    }
    @Test
    public void test3Mul(){
        int[][] A = new int[1][5];
        int[][] B ={{30},
                     {57},
                     {32},
                     {93},
                     {33}};
        int[][] result = new int[1][1];
        assertArrayEquals(result,project_two.Project_two.MUL(A, B));
    }
    @Test
    public void test2Transpose(){
        int[][] A = new int[3][17];
        int[][] result = new int[17][3];
        assertArrayEquals(result, project_two.Project_two.Transpose(A, A.length, A[0].length));
    }
    @Test
    public void test3Transpose(){
        int[][] A = {{100}};
        int[][] result = {{100}};
        assertArrayEquals(result, project_two.Project_two.Transpose(A, A.length, A[0].length));
    }
    
}
