package com.hbb20;

import android.content.Context;
import android.util.SparseArray;
import com.hbb20.CountryCodePicker;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.hbb20.b */
/* loaded from: classes6.dex */
public class C11557b {

    /* renamed from: d */
    public static SparseArray f13484d;

    /* renamed from: a */
    public String f13485a;

    /* renamed from: b */
    public int f13486b;

    /* renamed from: c */
    public HashMap f13487c;

    public C11557b(String str, int i, HashMap map) {
        this.f13485a = str;
        this.f13486b = i;
        this.f13487c = map;
    }

    /* renamed from: a */
    public static void m15869a() {
        HashMap map = new HashMap();
        map.put("ag", "268");
        map.put("ai", "264");
        map.put("as", "684");
        map.put("bb", "246");
        map.put("bm", "441");
        map.put("bs", "242");
        map.put("ca", "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/");
        map.put("dm", "767");
        map.put("do", "809/829/849");
        map.put("gd", "473");
        map.put("gu", "671");
        map.put("jm", "876");
        map.put("kn", "869");
        map.put("ky", "345");
        map.put("lc", "758");
        map.put("mp", "670");
        map.put("ms", "664");
        map.put("pr", "787");
        map.put("sx", "721");
        map.put("tc", "649");
        map.put("tt", "868");
        map.put("vc", "784");
        map.put("vg", "284");
        map.put("vi", "340");
        f13484d.put(1, new C11557b("us", 3, map));
    }

    /* renamed from: b */
    public static void m15870b() {
        HashMap map = new HashMap();
        map.put("ax", "18");
        f13484d.put(358, new C11557b("fi", 2, map));
    }

    /* renamed from: c */
    public static void m15871c() {
        HashMap map = new HashMap();
        map.put("gg", "1481");
        map.put("im", "1624");
        map.put("je", "1534");
        f13484d.put(44, new C11557b("gb", 4, map));
    }

    /* renamed from: e */
    public static C11557b m15872e(int i) {
        if (f13484d == null) {
            m15873f();
        }
        return (C11557b) f13484d.get(i);
    }

    /* renamed from: f */
    public static void m15873f() {
        f13484d = new SparseArray();
        m15869a();
        m15871c();
        m15870b();
    }

    /* renamed from: d */
    public C11556a m15874d(Context context, CountryCodePicker.EnumC11551i enumC11551i, String str) {
        String str2 = this.f13485a;
        for (Map.Entry entry : this.f13487c.entrySet()) {
            if (((String) entry.getValue()).contains(str)) {
                str2 = (String) entry.getKey();
            }
        }
        return C11556a.m15848m(context, enumC11551i, str2);
    }
}
