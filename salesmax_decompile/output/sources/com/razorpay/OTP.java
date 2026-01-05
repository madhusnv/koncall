package com.razorpay;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class OTP {

    /* renamed from: a */
    String f13659a;

    /* renamed from: b */
    private String f13660b;

    /* renamed from: c */
    private String f13661c;

    public OTP(String str, String str2, String str3) {
        this.f13660b = str;
        this.f13661c = str2;
        this.f13659a = str3;
        if (!Pattern.compile("^\\d").matcher(this.f13660b).find()) {
            this.f13660b = this.f13660b.substring(1);
        }
        if (Pattern.compile("\\d$").matcher(this.f13660b).find()) {
            return;
        }
        String str4 = this.f13660b;
        this.f13660b = str4.substring(0, str4.length() - 1);
    }

    public String toString() {
        return "Pin: " + this.f13660b + " bank: " + this.f13661c + " sender: " + this.f13659a;
    }
}
