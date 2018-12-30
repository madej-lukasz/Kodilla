package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Africa implements SandStorage {
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("999999991354880");
        return sandQuantity;
    }
}
