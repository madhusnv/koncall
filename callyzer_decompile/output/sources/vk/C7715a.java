package vk;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sk.InterfaceC6854b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vk.a */
/* loaded from: classes.dex */
public final class C7715a implements InterfaceC6854b {

    /* renamed from: a */
    public static final Logger f37243a = Logger.getLogger(C7715a.class.getName());

    /* renamed from: a */
    public final InputStream m14708a(String str) {
        InputStream resourceAsStream = C7715a.class.getResourceAsStream(str);
        if (resourceAsStream == null) {
            f37243a.log(Level.WARNING, "File " + str + " not found");
        }
        return resourceAsStream;
    }
}
