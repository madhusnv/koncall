package com.amplifyframework.predictions.aws.adapter;

import com.amplifyframework.predictions.models.EntityType;
import p001o.ai6;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class EntityTypeAdapter {
    public static final EntityTypeAdapter INSTANCE = new EntityTypeAdapter();

    private EntityTypeAdapter() {
    }

    public static final EntityType fromComprehend(String str) {
        sq8.m48649h(str, "entity");
        ai6 ai6VarM17143a = ai6.f14774a.m17143a(str);
        return sq8.m48644c(ai6VarM17143a, ai6.C12188h.f14788c) ? EntityType.PERSON : sq8.m48644c(ai6VarM17143a, ai6.C12185e.f14782c) ? EntityType.LOCATION : sq8.m48644c(ai6VarM17143a, ai6.C12186f.f14784c) ? EntityType.ORGANIZATION : sq8.m48644c(ai6VarM17143a, ai6.C12181a.f14776c) ? EntityType.COMMERCIAL_ITEM : sq8.m48644c(ai6VarM17143a, ai6.C12184d.f14780c) ? EntityType.EVENT : sq8.m48644c(ai6VarM17143a, ai6.C12183c.f14778c) ? EntityType.DATE : sq8.m48644c(ai6VarM17143a, ai6.C12189i.f14790c) ? EntityType.QUANTITY : sq8.m48644c(ai6VarM17143a, ai6.C12191k.f14793c) ? EntityType.TITLE : sq8.m48644c(ai6VarM17143a, ai6.C12187g.f14786c) ? EntityType.UNKNOWN : EntityType.UNKNOWN;
    }
}
