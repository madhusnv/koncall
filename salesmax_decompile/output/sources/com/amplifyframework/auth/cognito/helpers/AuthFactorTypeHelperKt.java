package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.AuthFactorType;
import java.util.Iterator;
import p001o.gi6;
import p001o.hi6;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthFactorTypeHelperKt {

    public /* synthetic */ class EntriesMappings {
        public static final /* synthetic */ gi6 entries$0 = hi6.m30609a(AuthFactorType.values());
    }

    public static final AuthFactorType toAuthFactorTypeOrNull(String str) {
        Object next;
        sq8.m48649h(str, "<this>");
        Iterator<E> it = EntriesMappings.entries$0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((AuthFactorType) next).getChallengeResponse(), str)) {
                break;
            }
        }
        return (AuthFactorType) next;
    }
}
