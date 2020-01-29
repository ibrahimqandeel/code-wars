package code.war.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import code.war.kata.NotPrimeNumbers;

class NotPrimeNumbersTest {

	@Test
	void notPrimesTest() {
		assertEquals(
				"[75, 77, 222, 225, 232, 235, 237, 252, 253, 255, 272, 273, 275, 322, 323, 325, 327, 332, 333, 335, 352, 355, 357, 372, 375, 377, 522, 525, 527, 532, 533, 535, 537, 552, 553, 555, 572, 573, 575, 722, 723, 725, 732, 735, 737, 752, 753, 755, 772, 775, 777, 2222, 2223, 2225, 2227, 2232, 2233, 2235, 2252, 2253, 2255, 2257, 2272, 2275, 2277, 2322, 2323, 2325, 2327, 2332, 2335, 2337, 2352, 2353, 2355, 2372, 2373, 2375, 2522, 2523, 2525, 2527, 2532, 2533, 2535, 2537, 2552, 2553, 2555, 2572, 2573, 2575, 2577, 2722, 2723, 2725, 2727, 2732, 2733, 2735, 2737, 2752, 2755, 2757, 2772, 2773, 2775, 3222, 3223, 3225, 3227, 3232, 3233, 3235, 3237, 3252, 3255, 3272, 3273, 3275, 3277, 3322, 3325, 3327, 3332, 3333, 3335, 3337, 3352, 3353, 3355, 3357, 3372, 3375, 3377, 3522, 3523, 3525, 3532, 3535, 3537, 3552, 3553, 3555, 3572, 3573, 3575, 3577, 3722, 3723, 3725, 3732, 3735, 3737, 3752, 3753, 3755, 3757, 3772, 3773, 3775, 3777, 5222, 5223, 5225, 5232, 5235, 5252, 5253, 5255, 5257, 5272, 5275, 5277, 5322, 5325, 5327, 5332, 5335, 5337, 5352, 5353, 5355, 5357, 5372, 5373, 5375, 5377, 5522, 5523, 5525, 5532, 5533, 5535, 5537, 5552, 5553, 5555, 5572, 5575, 5577, 5722, 5723, 5725, 5727, 5732, 5733, 5735, 5752, 5753, 5755, 5757, 5772, 5773, 5775, 5777, 7222, 7223, 7225, 7227, 7232, 7233, 7235, 7252, 7255, 7257, 7272, 7273, 7275, 7277, 7322, 7323, 7325, 7327, 7332, 7335, 7337, 7352, 7353, 7355, 7357, 7372, 7373, 7375, 7377, 7522, 7525, 7527, 7532, 7533, 7535]",
				NotPrimeNumbers.notPrimes(74, 7536).toString());
		assertEquals("[22, 25, 27, 32, 33, 35, 52, 55, 57, 72, 75, 77]", NotPrimeNumbers.notPrimes(2, 222).toString());

		assertEquals("[2722, 2723, 2725, 2727, 2732, 2733, 2735, 2737, 2752, 2755, 2757, 2772, 2773, 2775]",
				NotPrimeNumbers.notPrimes(2700, 3000).toString());
		assertEquals(
				"[522, 525, 527, 532, 533, 535, 537, 552, 553, 555, 572, 573, 575, 722, 723, 725, 732, 735, 737, 752, 753, 755, 772, 775, 777]",
				NotPrimeNumbers.notPrimes(500, 999).toString());
		assertEquals(
				"[2222, 2223, 2225, 2227, 2232, 2233, 2235, 2252, 2253, 2255, 2257, 2272, 2275, 2277, 2322, 2323, 2325, 2327, 2332, 2335, 2337, 2352, 2353, 2355, 2372, 2373, 2375]",
				NotPrimeNumbers.notPrimes(999, 2500).toString());
	}
}