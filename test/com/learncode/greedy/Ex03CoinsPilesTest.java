package com.learncode.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex03CoinsPilesTest {

    @Test
    void getMinRemovalCount() {
        int[] a = {2, 2, 2, 2};
        assertEquals(0, new Ex03CoinsPiles().getMinRemovalCount(a, 0));
        int[] b = {1, 2, 5, 1, 1, 1};
        assertEquals(1, new Ex03CoinsPiles().getMinRemovalCount(b, 3));
        int[] c = {1, 5, 1, 2, 5, 1};
        assertEquals(2, new Ex03CoinsPiles().getMinRemovalCount(c, 3));
        int[] d = {142, 712, 254, 869, 548, 645, 663, 758, 38, 860, 724, 742, 530, 779, 317, 36, 191, 843, 289, 107, 41, 943, 265, 649, 447, 806, 891, 730, 371, 351, 7, 102, 394, 549, 630, 624, 85, 955, 757, 841, 967, 377, 932, 309, 945, 440, 627, 324, 538, 539, 119, 83, 930, 542, 834, 116, 640, 659, 705, 931, 978, 307, 674, 387, 22, 746, 925, 73, 271, 830, 778, 574, 98, 513};
        assertEquals(1495, new Ex03CoinsPiles().getMinRemovalCount(d, 665));
    }
}