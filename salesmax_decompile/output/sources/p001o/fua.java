package p001o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class fua {

    /* renamed from: a */
    public static final mya f24084a;

    /* renamed from: b */
    public static final Map f24085b;

    static {
        mya myaVar = new mya();
        f24084a = myaVar;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(r6e.material_personalized_color_primary), myaVar.A3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_primary), myaVar.q3());
        map.put(Integer.valueOf(r6e.material_personalized_color_primary_inverse), myaVar.j1());
        map.put(Integer.valueOf(r6e.material_personalized_color_primary_container), myaVar.B3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_primary_container), myaVar.r3());
        map.put(Integer.valueOf(r6e.material_personalized_color_secondary), myaVar.C3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_secondary), myaVar.s3());
        map.put(Integer.valueOf(r6e.material_personalized_color_secondary_container), myaVar.D3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_secondary_container), myaVar.t3());
        map.put(Integer.valueOf(r6e.material_personalized_color_tertiary), myaVar.N3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_tertiary), myaVar.w3());
        map.put(Integer.valueOf(r6e.material_personalized_color_tertiary_container), myaVar.O3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_tertiary_container), myaVar.x3());
        map.put(Integer.valueOf(r6e.material_personalized_color_background), myaVar.a1());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_background), myaVar.n3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface), myaVar.E3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_surface), myaVar.u3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_variant), myaVar.M3());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_surface_variant), myaVar.v3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_inverse), myaVar.k1());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_surface_inverse), myaVar.i1());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_bright), myaVar.F3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_dim), myaVar.L3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_container), myaVar.G3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_container_low), myaVar.J3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_container_high), myaVar.H3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_container_lowest), myaVar.K3());
        map.put(Integer.valueOf(r6e.material_personalized_color_surface_container_highest), myaVar.I3());
        map.put(Integer.valueOf(r6e.material_personalized_color_outline), myaVar.y3());
        map.put(Integer.valueOf(r6e.material_personalized_color_outline_variant), myaVar.z3());
        map.put(Integer.valueOf(r6e.material_personalized_color_error), myaVar.e1());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_error), myaVar.o3());
        map.put(Integer.valueOf(r6e.material_personalized_color_error_container), myaVar.f1());
        map.put(Integer.valueOf(r6e.material_personalized_color_on_error_container), myaVar.p3());
        map.put(Integer.valueOf(r6e.material_personalized_color_control_activated), myaVar.b1());
        map.put(Integer.valueOf(r6e.material_personalized_color_control_normal), myaVar.d1());
        map.put(Integer.valueOf(r6e.material_personalized_color_control_highlight), myaVar.c1());
        map.put(Integer.valueOf(r6e.material_personalized_color_text_primary_inverse), myaVar.Q3());
        map.put(Integer.valueOf(r6e.material_personalized_color_text_secondary_and_tertiary_inverse), myaVar.S3());
        map.put(Integer.valueOf(r6e.f43057xbc712906), myaVar.T3());
        map.put(Integer.valueOf(r6e.material_personalized_color_text_primary_inverse_disable_only), myaVar.R3());
        map.put(Integer.valueOf(r6e.material_personalized_color_text_hint_foreground_inverse), myaVar.P3());
        f24085b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    public static Map m27522a(i26 i26Var) {
        HashMap map = new HashMap();
        for (Map.Entry entry : f24085b.entrySet()) {
            map.put((Integer) entry.getKey(), Integer.valueOf(((u16) entry.getValue()).m50843c(i26Var)));
        }
        return Collections.unmodifiableMap(map);
    }
}
