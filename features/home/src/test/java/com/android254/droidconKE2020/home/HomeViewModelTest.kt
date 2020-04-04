package com.android254.droidconKE2020.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.android254.droidconKE2020.home.di.homeRepositories
import com.android254.droidconKE2020.home.di.homeViewModels
import com.android254.droidconKE2020.home.viewmodel.HomeViewModel
import io.mockk.impl.annotations.InjectMockKs
import org.junit.*
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.mockito.MockitoAnnotations

class HomeViewModelTest : KoinTest {

    @get:Rule
    val instantTask = InstantTaskExecutorRule()

    @Before
    fun before() {
        startKoin {
            modules(listOf(homeViewModels, homeRepositories))
        }
        MockitoAnnotations.initMocks(this)
    }

    @After
    fun after() {
        stopKoin()
    }

    private val homeViewModel: HomeViewModel by inject()

    @Test
    fun `test that a promotion is retrieved when checkForNewPromo() is called`() {
        Assert.assertEquals(homeViewModel.doSum(2, 2), 4)


    }
}