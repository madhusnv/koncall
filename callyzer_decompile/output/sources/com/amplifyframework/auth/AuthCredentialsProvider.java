package com.amplifyframework.auth;

import com.amplifyframework.annotations.InternalApiWarning;
import com.amplifyframework.core.Consumer;
import ec.InterfaceC2004b;
import sb.InterfaceC6779f;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InternalApiWarning
/* loaded from: classes.dex */
public interface AuthCredentialsProvider extends InterfaceC6779f {
    void getAccessToken(Consumer<String> consumer, Consumer<Exception> consumer2);

    Object getIdentityId(InterfaceC7559c<? super String> interfaceC7559c);

    @Override // vc.InterfaceC7700c
    /* synthetic */ Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c);
}
