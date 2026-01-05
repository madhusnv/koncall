package com.amplifyframework.auth.cognito;

import com.amplifyframework.annotations.InternalAmplifyApi;
import pg.b8;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalAmplifyApi
/* loaded from: classes.dex */
public final class UsernameAttribute {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
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
        $ENTRIES = b8.m11548b(usernameAttributeArr$values);
    }

    private UsernameAttribute(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static UsernameAttribute valueOf(String str) {
        return (UsernameAttribute) Enum.valueOf(UsernameAttribute.class, str);
    }

    public static UsernameAttribute[] values() {
        return (UsernameAttribute[]) $VALUES.clone();
    }
}
