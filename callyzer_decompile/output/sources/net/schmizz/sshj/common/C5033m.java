package net.schmizz.sshj.common;

import ny.InterfaceC5188b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: net.schmizz.sshj.common.m */
/* loaded from: classes3.dex */
public final class C5033m implements InterfaceC5188b {

    /* renamed from: a */
    public static final C5033m f24784a = new C5033m();

    @Override // ny.InterfaceC5188b
    /* renamed from: c */
    public Throwable mo394c(Exception exc) {
        return exc instanceof SSHException ? (SSHException) exc : new SSHException(exc);
    }
}
