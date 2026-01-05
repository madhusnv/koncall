package p001o;

/* loaded from: classes6.dex */
public abstract class yga {
    /* renamed from: a */
    public static Class m57780a(Class cls, String str) {
        return m57781b(cls, str, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:17:0x002b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0039 -> B:15:0x0025). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x003b -> B:15:0x0025). Please report as a decompilation issue!!! */
    /* renamed from: b */
    public static java.lang.Class m57781b(java.lang.Class r5, java.lang.String r6, boolean r7) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
            r3 = r2
        Lb:
            if (r2 != 0) goto L23
            if (r0 == 0) goto L23
            java.lang.Class r2 = r0.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L14
            goto L18
        L14:
            r4 = move-exception
            if (r3 != 0) goto L18
            r3 = r4
        L18:
            if (r2 != 0) goto L21
            if (r7 == 0) goto L21
            java.lang.ClassLoader r0 = r0.getParent()
            goto Lb
        L21:
            r0 = r1
            goto Lb
        L23:
            if (r5 != 0) goto L27
        L25:
            r5 = r1
            goto L2b
        L27:
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L2b:
            if (r2 != 0) goto L42
            if (r5 == 0) goto L42
            java.lang.Class r0 = r5.loadClass(r6)     // Catch: java.lang.ClassNotFoundException -> L35
            r2 = r0
            goto L39
        L35:
            r0 = move-exception
            if (r3 != 0) goto L39
            r3 = r0
        L39:
            if (r2 != 0) goto L25
            if (r7 == 0) goto L25
            java.lang.ClassLoader r5 = r5.getParent()
            goto L2b
        L42:
            if (r2 != 0) goto L4d
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch: java.lang.ClassNotFoundException -> L49
            goto L4d
        L49:
            r5 = move-exception
            if (r3 != 0) goto L4d
            r3 = r5
        L4d:
            if (r2 == 0) goto L50
            return r2
        L50:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p001o.yga.m57781b(java.lang.Class, java.lang.String, boolean):java.lang.Class");
    }
}
