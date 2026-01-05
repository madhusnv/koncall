package com.amplifyframework.predictions.aws.adapter;

import android.graphics.PointF;
import android.graphics.RectF;
import com.amplifyframework.predictions.aws.models.BinaryFeatureType;
import com.amplifyframework.predictions.models.AgeRange;
import com.amplifyframework.predictions.models.BinaryFeature;
import com.amplifyframework.predictions.models.IdentifiedText;
import com.amplifyframework.predictions.models.Landmark;
import com.amplifyframework.predictions.models.LandmarkType;
import com.amplifyframework.predictions.models.Polygon;
import com.amplifyframework.predictions.models.Pose;
import com.amplifyframework.util.Empty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.gl1;
import p001o.gr6;
import p001o.og9;
import p001o.qed;
import p001o.sgh;
import p001o.y80;
import p001o.zbd;

/* loaded from: classes5.dex */
public final class RekognitionResultTransformers {
    private RekognitionResultTransformers() {
    }

    public static RectF fromBoundingBox(gl1 gl1Var) {
        if (gl1Var == null || gl1Var.m28974b() == null || gl1Var.m28975c() == null || gl1Var.m28976d() == null || gl1Var.m28973a() == null) {
            return null;
        }
        return new RectF(gl1Var.m28974b().floatValue(), gl1Var.m28975c().floatValue(), gl1Var.m28974b().floatValue() + gl1Var.m28976d().floatValue(), gl1Var.m28975c().floatValue() + gl1Var.m28973a().floatValue());
    }

    public static List<BinaryFeature> fromFaceDetail(gr6 gr6Var) {
        ArrayList arrayList = new ArrayList();
        if (gr6Var.m29345b() != null && gr6Var.m29345b().m57709a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.BEARD.getAlias()).value(Boolean.valueOf(gr6Var.m29345b().m57710b()))).confidence(gr6Var.m29345b().m57709a().floatValue())).build());
        }
        if (gr6Var.m29356m() != null && gr6Var.m29356m().m48207a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.SUNGLASSES.getAlias()).value(Boolean.valueOf(gr6Var.m29356m().m48208b()))).confidence(gr6Var.m29356m().m48207a().floatValue())).build());
        }
        if (gr6Var.m29355l() != null && gr6Var.m29355l().m41188a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.SMILE.getAlias()).value(Boolean.valueOf(gr6Var.m29355l().m41189b()))).confidence(gr6Var.m29355l().m41188a().floatValue())).build());
        }
        if (gr6Var.m29348e() != null && gr6Var.m29348e().m23695a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.EYE_GLASSES.getAlias()).value(Boolean.valueOf(gr6Var.m29348e().m23696b()))).confidence(gr6Var.m29348e().m23695a().floatValue())).build());
        }
        if (gr6Var.m29353j() != null && gr6Var.m29353j().m45726a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.MUSTACHE.getAlias()).value(Boolean.valueOf(gr6Var.m29353j().m45727b()))).confidence(gr6Var.m29353j().m45726a().floatValue())).build());
        }
        if (gr6Var.m29352i() != null && gr6Var.m29352i().m52975a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.MOUTH_OPEN.getAlias()).value(Boolean.valueOf(gr6Var.m29352i().m52976b()))).confidence(gr6Var.m29352i().m52975a().floatValue())).build());
        }
        if (gr6Var.m29349f() != null && gr6Var.m29349f().m19626a() != null) {
            arrayList.add(((BinaryFeature.Builder) ((BinaryFeature.Builder) BinaryFeature.builder().type(BinaryFeatureType.EYES_OPEN.getAlias()).value(Boolean.valueOf(gr6Var.m29349f().m19627b()))).confidence(gr6Var.m29349f().m19626a().floatValue())).build());
        }
        return arrayList;
    }

    public static List<Landmark> fromLandmarks(List<og9> list) {
        ArrayList arrayList = new ArrayList();
        if (Empty.check(list)) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        HashMap map = new HashMap();
        for (og9 og9Var : list) {
            if (og9Var.m42214a() != null && og9Var.m42215b() != null && og9Var.m42216c() != null) {
                LandmarkType landmarkTypeFromRekognition = LandmarkTypeAdapter.fromRekognition(og9Var.m42214a().mo45430a());
                PointF pointF = new PointF(og9Var.m42215b().floatValue(), og9Var.m42216c().floatValue());
                List arrayList3 = (List) map.get(landmarkTypeFromRekognition);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    map.put(landmarkTypeFromRekognition, arrayList3);
                }
                arrayList3.add(pointF);
                arrayList2.add(pointF);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Landmark((LandmarkType) entry.getKey(), (List) entry.getValue()));
        }
        arrayList.add(new Landmark(LandmarkType.ALL_POINTS, arrayList2));
        return arrayList;
    }

    public static Polygon fromPoints(List<zbd> list) {
        if (Empty.check(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (zbd zbdVar : list) {
            if (zbdVar.m59154a() == null || zbdVar.m59155b() == null) {
                return null;
            }
            arrayList.add(new PointF(zbdVar.m59154a().floatValue(), zbdVar.m59155b().floatValue()));
        }
        return Polygon.fromPoints(arrayList);
    }

    public static AgeRange fromRekognitionAgeRange(y80 y80Var) {
        if (y80Var == null || y80Var.m57352b() == null || y80Var.m57351a() == null) {
            return null;
        }
        return new AgeRange(y80Var.m57352b().intValue(), y80Var.m57351a().intValue());
    }

    public static Pose fromRekognitionPose(qed qedVar) {
        if (qedVar == null || qedVar.m45291a() == null || qedVar.m45292b() == null || qedVar.m45293c() == null) {
            return null;
        }
        return new Pose(qedVar.m45291a().floatValue(), qedVar.m45292b().floatValue(), qedVar.m45293c().floatValue());
    }

    public static IdentifiedText fromTextDetection(sgh sghVar) {
        if (sghVar == null || sghVar.m48330b() == null || sghVar.m48329a() == null) {
            return null;
        }
        return ((IdentifiedText.Builder) ((IdentifiedText.Builder) ((IdentifiedText.Builder) IdentifiedText.builder().text(sghVar.m48330b()).confidence(sghVar.m48329a().floatValue())).box(sghVar.m48331c() != null ? fromBoundingBox(sghVar.m48331c().m30879a()) : null)).polygon(fromPoints(sghVar.m48331c().m30880b()))).build();
    }
}
