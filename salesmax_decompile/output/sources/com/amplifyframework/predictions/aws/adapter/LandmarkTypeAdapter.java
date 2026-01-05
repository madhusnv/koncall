package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.LandmarkType;
import p001o.qg9;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class LandmarkTypeAdapter {
    public static final LandmarkTypeAdapter INSTANCE = new LandmarkTypeAdapter();

    private LandmarkTypeAdapter() {
    }

    public static final LandmarkType fromRekognition(String str) {
        sq8.m48649h(str, "landmark");
        qg9 qg9VarM45431a = qg9.f41903a.m45431a(str);
        if (sq8.m48644c(qg9VarM45431a, qg9.C16376c.f41911c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16382i.f41930c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16383j.f41932c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16384k.f41934c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16381h.f41928c)) {
            return LandmarkType.LEFT_EYE;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16377d.f41915c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16399z.f41964c) ? true : sq8.m48644c(qg9VarM45431a, qg9.a0.f41907c) ? true : sq8.m48644c(qg9VarM45431a, qg9.b0.f41909c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16398y.f41962c)) {
            return LandmarkType.RIGHT_EYE;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16378e.f41918c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16379f.f41922c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16380g.f41926c)) {
            return LandmarkType.LEFT_EYEBROW;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16395v.f41956c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16396w.f41958c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16397x.f41960c)) {
            return LandmarkType.RIGHT_EYEBROW;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16392s.f41950c)) {
            return LandmarkType.NOSE;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16393t.f41952c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16394u.f41954c)) {
            return LandmarkType.NOSE_CREST;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16389p.f41944c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16390q.f41946c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16391r.f41948c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16388o.f41942c)) {
            return LandmarkType.OUTER_LIPS;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.C16385l.f41936c)) {
            return LandmarkType.LEFT_PUPIL;
        }
        if (sq8.m48644c(qg9VarM45431a, qg9.c0.f41913c)) {
            return LandmarkType.RIGHT_PUPIL;
        }
        return sq8.m48644c(qg9VarM45431a, qg9.e0.f41920c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16386m.f41938c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16374a.f41905c) ? true : sq8.m48644c(qg9VarM45431a, qg9.C16387n.f41940c) ? true : sq8.m48644c(qg9VarM45431a, qg9.f0.f41924c) ? LandmarkType.FACE_CONTOUR : LandmarkType.UNKNOWN;
    }
}
