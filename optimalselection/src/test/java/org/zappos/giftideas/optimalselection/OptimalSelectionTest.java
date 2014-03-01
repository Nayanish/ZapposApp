package org.zappos.giftideas.optimalselection;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.zappos.giftideas.optimalselection.entity.ProductList;

@RunWith(MockitoJUnitRunner.class)
public class OptimalSelectionTest {
    @InjectMocks
    private OptimalSelection optimalSelection = new OptimalSelection();
    @Mock
    private ZapposAPIHandler handler;
    @Before
    public void setUp() {
        //optimalSelection.setHandler(Mockito.mock(ZapposAPIHandler.class));
    }

    @Test
    public void testNoProductsWithZappos() throws Exception {
        when(handler.search(Mockito.anyDouble(), Mockito.anyInt())).thenReturn();
        List<ProductList> list = optimalSelection.getOptimalSelection(13, 2);
    }
}
