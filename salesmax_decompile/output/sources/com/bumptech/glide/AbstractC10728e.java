package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C10725b;
import com.bumptech.glide.load.data.C10734c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import p001o.a4i;
import p001o.ai1;
import p001o.aoe;
import p001o.aq1;
import p001o.b4i;
import p001o.bi1;
import p001o.bq1;
import p001o.ci1;
import p001o.cq1;
import p001o.dhe;
import p001o.di1;
import p001o.dq1;
import p001o.dt7;
import p001o.dui;
import p001o.eh0;
import p001o.eq1;
import p001o.ey5;
import p001o.fi1;
import p001o.ft7;
import p001o.h38;
import p001o.ioe;
import p001o.is7;
import p001o.jm0;
import p001o.jm6;
import p001o.js7;
import p001o.k8g;
import p001o.koe;
import p001o.ks7;
import p001o.ls7;
import p001o.mi1;
import p001o.ooe;
import p001o.oz4;
import p001o.p6g;
import p001o.pj8;
import p001o.qe5;
import p001o.qs7;
import p001o.r8i;
import p001o.rwc;
import p001o.sp0;
import p001o.sx5;
import p001o.t6g;
import p001o.tq;
import p001o.u3e;
import p001o.u9b;
import p001o.up1;
import p001o.uw6;
import p001o.v8i;
import p001o.v9b;
import p001o.vsh;
import p001o.w6g;
import p001o.wo0;
import p001o.wv6;
import p001o.x9b;
import p001o.yp1;
import p001o.z3i;
import p001o.z7i;

/* renamed from: com.bumptech.glide.e */
/* loaded from: classes5.dex */
public abstract class AbstractC10728e {

    /* renamed from: com.bumptech.glide.e$a */
    public class a implements dt7.InterfaceC13029b {

        /* renamed from: a */
        public boolean f11195a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C10724a f11196b;

        /* renamed from: c */
        public final /* synthetic */ List f11197c;

        /* renamed from: d */
        public final /* synthetic */ jm0 f11198d;

        public a(ComponentCallbacks2C10724a componentCallbacks2C10724a, List list, jm0 jm0Var) {
            this.f11196b = componentCallbacks2C10724a;
            this.f11197c = list;
            this.f11198d = jm0Var;
        }

        @Override // p001o.dt7.InterfaceC13029b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public dhe get() {
            if (this.f11195a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            this.f11195a = true;
            vsh.m53384a("Glide registry");
            try {
                return AbstractC10728e.m12680a(this.f11196b, this.f11197c, this.f11198d);
            } finally {
                vsh.m53385b();
            }
        }
    }

    /* renamed from: a */
    public static dhe m12680a(ComponentCallbacks2C10724a componentCallbacks2C10724a, List list, jm0 jm0Var) {
        mi1 mi1VarM12656f = componentCallbacks2C10724a.m12656f();
        wo0 wo0VarM12655e = componentCallbacks2C10724a.m12655e();
        Context applicationContext = componentCallbacks2C10724a.m12659i().getApplicationContext();
        C10727d c10727dM12674g = componentCallbacks2C10724a.m12659i().m12674g();
        dhe dheVar = new dhe();
        m12681b(applicationContext, dheVar, mi1VarM12656f, wo0VarM12655e, c10727dM12674g);
        m12682c(applicationContext, componentCallbacks2C10724a, dheVar, list, jm0Var);
        return dheVar;
    }

    /* renamed from: b */
    public static void m12681b(Context context, dhe dheVar, mi1 mi1Var, wo0 wo0Var, C10727d c10727d) {
        ioe yp1Var;
        ioe p6gVar;
        dhe dheVar2;
        Class cls;
        dheVar.m23132o(new qe5());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            dheVar.m23132o(new jm6());
        }
        Resources resources = context.getResources();
        List listM23124g = dheVar.m23124g();
        dq1 dq1Var = new dq1(context, listM23124g, mi1Var, wo0Var);
        ioe ioeVarM23865l = dui.m23865l(mi1Var);
        sx5 sx5Var = new sx5(dheVar.m23124g(), resources.getDisplayMetrics(), mi1Var, wo0Var);
        if (i < 28 || !c10727d.m12677a(C10725b.b.class)) {
            yp1Var = new yp1(sx5Var);
            p6gVar = new p6g(sx5Var, wo0Var);
        } else {
            p6gVar = new pj8();
            yp1Var = new aq1();
        }
        if (i >= 28) {
            dheVar.m23122e("Animation", InputStream.class, Drawable.class, eh0.m25004f(listM23124g, wo0Var));
            dheVar.m23122e("Animation", ByteBuffer.class, Drawable.class, eh0.m25003a(listM23124g, wo0Var));
        }
        koe koeVar = new koe(context);
        ooe.C15859c c15859c = new ooe.C15859c(resources);
        ooe.C15860d c15860d = new ooe.C15860d(resources);
        ooe.C15858b c15858b = new ooe.C15858b(resources);
        ooe.C15857a c15857a = new ooe.C15857a(resources);
        fi1 fi1Var = new fi1(wo0Var);
        ai1 ai1Var = new ai1();
        ks7 ks7Var = new ks7();
        ContentResolver contentResolver = context.getContentResolver();
        dheVar.m23120c(ByteBuffer.class, new bq1()).m23120c(InputStream.class, new t6g(wo0Var)).m23122e("Bitmap", ByteBuffer.class, Bitmap.class, yp1Var).m23122e("Bitmap", InputStream.class, Bitmap.class, p6gVar);
        if (ParcelFileDescriptorRewinder.m12699a()) {
            dheVar.m23122e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new rwc(sx5Var));
        }
        dheVar.m23122e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, ioeVarM23865l).m23122e("Bitmap", AssetFileDescriptor.class, Bitmap.class, dui.m23856c(mi1Var)).m23118a(Bitmap.class, Bitmap.class, b4i.C12280a.m18151a()).m23122e("Bitmap", Bitmap.class, Bitmap.class, new z3i()).m23121d(Bitmap.class, fi1Var).m23122e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new bi1(resources, yp1Var)).m23122e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new bi1(resources, p6gVar)).m23122e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new bi1(resources, ioeVarM23865l)).m23121d(BitmapDrawable.class, new ci1(mi1Var, fi1Var)).m23122e("Animation", InputStream.class, js7.class, new w6g(listM23124g, dq1Var, wo0Var)).m23122e("Animation", ByteBuffer.class, js7.class, dq1Var).m23121d(js7.class, new ls7()).m23118a(is7.class, is7.class, b4i.C12280a.m18151a()).m23122e("Bitmap", is7.class, Bitmap.class, new qs7(mi1Var)).m23119b(Uri.class, Drawable.class, koeVar).m23119b(Uri.class, Bitmap.class, new aoe(koeVar, mi1Var)).m23133p(new eq1.C13245a()).m23118a(File.class, ByteBuffer.class, new cq1.C12722b()).m23118a(File.class, InputStream.class, new uw6.C17464e()).m23119b(File.class, File.class, new wv6()).m23118a(File.class, ParcelFileDescriptor.class, new uw6.C17461b()).m23118a(File.class, File.class, b4i.C12280a.m18151a()).m23133p(new C10734c.a(wo0Var));
        if (ParcelFileDescriptorRewinder.m12699a()) {
            dheVar2 = dheVar;
            cls = AssetFileDescriptor.class;
            dheVar2.m23133p(new ParcelFileDescriptorRewinder.C10731a());
        } else {
            dheVar2 = dheVar;
            cls = AssetFileDescriptor.class;
        }
        Class cls2 = Integer.TYPE;
        dheVar2.m23118a(cls2, InputStream.class, c15859c).m23118a(cls2, ParcelFileDescriptor.class, c15858b).m23118a(Integer.class, InputStream.class, c15859c).m23118a(Integer.class, ParcelFileDescriptor.class, c15858b).m23118a(Integer.class, Uri.class, c15860d).m23118a(cls2, cls, c15857a).m23118a(Integer.class, cls, c15857a).m23118a(cls2, Uri.class, c15860d).m23118a(String.class, InputStream.class, new oz4.C15917c()).m23118a(Uri.class, InputStream.class, new oz4.C15917c()).m23118a(String.class, InputStream.class, new k8g.C14737c()).m23118a(String.class, ParcelFileDescriptor.class, new k8g.C14736b()).m23118a(String.class, cls, new k8g.C14735a()).m23118a(Uri.class, InputStream.class, new sp0.C16886c(context.getAssets())).m23118a(Uri.class, cls, new sp0.C16885b(context.getAssets())).m23118a(Uri.class, InputStream.class, new v9b.C17535a(context)).m23118a(Uri.class, InputStream.class, new x9b.C18084a(context));
        if (i >= 29) {
            dheVar2.m23118a(Uri.class, InputStream.class, new u3e.C17292c(context));
            dheVar2.m23118a(Uri.class, ParcelFileDescriptor.class, new u3e.C17291b(context));
        }
        dheVar2.m23118a(Uri.class, InputStream.class, new z7i.C18571d(contentResolver)).m23118a(Uri.class, ParcelFileDescriptor.class, new z7i.C18569b(contentResolver)).m23118a(Uri.class, cls, new z7i.C18568a(contentResolver)).m23118a(Uri.class, InputStream.class, new v8i.C17528a()).m23118a(URL.class, InputStream.class, new r8i.C16555a()).m23118a(Uri.class, File.class, new u9b.C17340a(context)).m23118a(ft7.class, InputStream.class, new h38.C13845a()).m23118a(byte[].class, ByteBuffer.class, new up1.C17424a()).m23118a(byte[].class, InputStream.class, new up1.C17427d()).m23118a(Uri.class, Uri.class, b4i.C12280a.m18151a()).m23118a(Drawable.class, Drawable.class, b4i.C12280a.m18151a()).m23119b(Drawable.class, Drawable.class, new a4i()).m23134q(Bitmap.class, BitmapDrawable.class, new di1(resources)).m23134q(Bitmap.class, byte[].class, ai1Var).m23134q(Drawable.class, byte[].class, new ey5(mi1Var, ai1Var, ks7Var)).m23134q(js7.class, byte[].class, ks7Var);
        ioe ioeVarM23857d = dui.m23857d(mi1Var);
        dheVar2.m23119b(ByteBuffer.class, Bitmap.class, ioeVarM23857d);
        dheVar2.m23119b(ByteBuffer.class, BitmapDrawable.class, new bi1(resources, ioeVarM23857d));
    }

    /* renamed from: c */
    public static void m12682c(Context context, ComponentCallbacks2C10724a componentCallbacks2C10724a, dhe dheVar, List list, jm0 jm0Var) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
        if (jm0Var != null) {
            jm0Var.mo75a(context, componentCallbacks2C10724a, dheVar);
        }
    }

    /* renamed from: d */
    public static dt7.InterfaceC13029b m12683d(ComponentCallbacks2C10724a componentCallbacks2C10724a, List list, jm0 jm0Var) {
        return new a(componentCallbacks2C10724a, list, jm0Var);
    }
}
