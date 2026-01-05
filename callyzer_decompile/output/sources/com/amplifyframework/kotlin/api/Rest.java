package com.amplifyframework.kotlin.api;

import com.amplifyframework.api.rest.RestOptions;
import com.amplifyframework.api.rest.RestResponse;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface Rest {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object delete$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.delete(restOptions, str, interfaceC7559c);
    }

    static /* synthetic */ Object get$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.get(restOptions, str, interfaceC7559c);
    }

    static /* synthetic */ Object head$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: head");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.head(restOptions, str, interfaceC7559c);
    }

    static /* synthetic */ Object patch$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: patch");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.patch(restOptions, str, interfaceC7559c);
    }

    static /* synthetic */ Object post$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.post(restOptions, str, interfaceC7559c);
    }

    static /* synthetic */ Object put$default(Rest rest, RestOptions restOptions, String str, InterfaceC7559c interfaceC7559c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: put");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return rest.put(restOptions, str, interfaceC7559c);
    }

    Object delete(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);

    Object get(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);

    Object head(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);

    Object patch(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);

    Object post(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);

    Object put(RestOptions restOptions, String str, InterfaceC7559c<? super RestResponse> interfaceC7559c);
}
