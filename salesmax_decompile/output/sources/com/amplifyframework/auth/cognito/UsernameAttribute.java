package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import p001o.gi6;
import p001o.hi6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InternalAmplifyApi
/* loaded from: classes5.dex */
public final class UsernameAttribute {
    private static final /* synthetic */ gi6 $ENTRIES;
    private static final /* synthetic */ UsernameAttribute[] $VALUES;
    public static final UsernameAttribute Username = new UsernameAttribute("Username", 0);
    public static final UsernameAttribute Email = new UsernameAttribute("Email", 1);
    public static final UsernameAttribute PhoneNumber = new UsernameAttribute("PhoneNumber", 2);

    private static final /* synthetic */ UsernameAttribute[] $values() {
        return new UsernameAttribute[]{Username, Email, PhoneNumber};
    }

    static {
        UsernameAttribute[] usernameAttributeArr$values = $values();
        $VALUES = usernameAttributeArr$values;
        $ENTRIES = hi6.m30609a(usernameAttributeArr$values);
    }

    private UsernameAttribute(String str, int i) {
    }

    public static gi6 getEntries() {
        return $ENTRIES;
    }

    public static UsernameAttribute valueOf(String str) {
        return (UsernameAttribute) Enum.valueOf(UsernameAttribute.class, str);
    }

    public static UsernameAttribute[] values() {
        return (UsernameAttribute[]) $VALUES.clone();
    }
}
