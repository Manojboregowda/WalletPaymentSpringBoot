package com.synechron.project.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class BeneficiaryDto {
    @NotNull
    @Size(min = 10, max = 10, message = "Invalid Mobile Number [10 Digit Only]")
    private String beneficiaryMobileNumber;

    @NotNull
    @Size(min = 3, message = "Invalid Beneficiary name [Contains at least 3 characters]")
    private String beneficiaryName;

    private int walletId;
}
