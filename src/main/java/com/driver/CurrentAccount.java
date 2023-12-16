package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;

    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception
         if (this.tradeLicenseId.length() < 2) {
            throw new Exception("Valid License can not be generated");
        }
        StringBuilder new_license_id = new StringBuilder();
        new_license_id.append(this.tradeLicenseId.charAt(0));
        for (int i = 1; i < this.tradeLicenseId.length(); i++) {
            if (this.tradeLicenseId.charAt(i) != this.tradeLicenseId.charAt(i - 1)) {
                new_license_id.append(this.tradeLicenseId.charAt(i));
            } else {
                boolean found = false;
                for (char j = 'A'; j <= 'Z'; j++) {
                    if (j != this.tradeLicenseId.charAt(i - 1) && j != this.tradeLicenseId.charAt(i + 1)) {
                        new_license_id.append(j);
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    throw new Exception("Valid License can not be generated");
                }
            }
        }
        this.tradeLicenseId = new_license_id.toString();

    }

}
