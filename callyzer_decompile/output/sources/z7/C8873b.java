package z7;

import android.content.Context;
import android.content.Intent;
import ge.C2581m;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k8.InterfaceC4025b;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4430d;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.b */
/* loaded from: classes.dex */
public final class C8873b {

    /* renamed from: a */
    public final Context f42690a;

    /* renamed from: b */
    public final String f42691b;

    /* renamed from: c */
    public final InterfaceC4430d f42692c;

    /* renamed from: d */
    public final C2581m f42693d;

    /* renamed from: e */
    public final List f42694e;

    /* renamed from: f */
    public final boolean f42695f;

    /* renamed from: g */
    public final EnumC8893v f42696g;

    /* renamed from: h */
    public final Executor f42697h;

    /* renamed from: i */
    public final Executor f42698i;

    /* renamed from: j */
    public final Intent f42699j;

    /* renamed from: k */
    public final boolean f42700k;

    /* renamed from: l */
    public final boolean f42701l;

    /* renamed from: m */
    public final Set f42702m;

    /* renamed from: n */
    public final String f42703n;

    /* renamed from: o */
    public final File f42704o;

    /* renamed from: p */
    public final Callable f42705p;

    /* renamed from: q */
    public final List f42706q;

    /* renamed from: r */
    public final List f42707r;

    /* renamed from: s */
    public final boolean f42708s;

    /* renamed from: t */
    public final InterfaceC4025b f42709t;

    /* renamed from: u */
    public final InterfaceC7564h f42710u;

    /* renamed from: v */
    public boolean f42711v;

    public C8873b(Context context, String str, InterfaceC4430d interfaceC4430d, C2581m migrationContainer, List list, boolean z6, EnumC8893v journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z12, InterfaceC4025b interfaceC4025b, InterfaceC7564h interfaceC7564h) {
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(migrationContainer, "migrationContainer");
        AbstractC4154l.m8923f(journalMode, "journalMode");
        AbstractC4154l.m8923f(queryExecutor, "queryExecutor");
        AbstractC4154l.m8923f(transactionExecutor, "transactionExecutor");
        AbstractC4154l.m8923f(typeConverters, "typeConverters");
        AbstractC4154l.m8923f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f42690a = context;
        this.f42691b = str;
        this.f42692c = interfaceC4430d;
        this.f42693d = migrationContainer;
        this.f42694e = list;
        this.f42695f = z6;
        this.f42696g = journalMode;
        this.f42697h = queryExecutor;
        this.f42698i = transactionExecutor;
        this.f42699j = intent;
        this.f42700k = z10;
        this.f42701l = z11;
        this.f42702m = set;
        this.f42703n = str2;
        this.f42704o = file;
        this.f42705p = callable;
        this.f42706q = typeConverters;
        this.f42707r = autoMigrationSpecs;
        this.f42708s = z12;
        this.f42709t = interfaceC4025b;
        this.f42710u = interfaceC7564h;
        this.f42711v = true;
    }
}
