package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthFactorType;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AuthFactorTypeHelperKt {
    public static final AuthFactorType toAuthFactorTypeOrNull(String str) {
        Object next;
        AbstractC4154l.m8923f(str, "<this>");
        Iterator<E> it = AuthFactorType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4154l.m8918a(((AuthFactorType) next).getChallengeResponse(), str)) {
                break;
            }
        }
        return (AuthFactorType) next;
    }
}
