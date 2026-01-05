package com.amplifyframework.kotlin.storage;

import com.amplifyframework.storage.StorageException;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.kotlin.storage.Storage$InProgressStorageOperation$result$2", m15344f = "Storage.kt", m15345l = {}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Storage$InProgressStorageOperation$result$2 extends AbstractC8199i implements InterfaceC2141e {
    /* synthetic */ Object L$0;
    int label;

    public Storage$InProgressStorageOperation$result$2(InterfaceC7559c<? super Storage$InProgressStorageOperation$result$2> interfaceC7559c) {
        super(2, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        Storage$InProgressStorageOperation$result$2 storage$InProgressStorageOperation$result$2 = new Storage$InProgressStorageOperation$result$2(interfaceC7559c);
        storage$InProgressStorageOperation$result$2.L$0 = obj;
        return storage$InProgressStorageOperation$result$2;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = this.L$0;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        od.m10798c(obj);
        if (obj2 instanceof StorageException) {
            throw ((Throwable) obj2);
        }
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((Storage$InProgressStorageOperation$result$2) create(obj, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
