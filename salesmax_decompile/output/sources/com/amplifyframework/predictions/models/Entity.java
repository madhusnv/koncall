package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.TextFeature;

/* loaded from: classes5.dex */
public final class Entity extends TextFeature<EntityType> {

    public static final class Builder extends TextFeature.Builder<Builder, Entity, EntityType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.TextFeature.Builder
        public /* bridge */ /* synthetic */ TextFeature.Builder startIndex(int i) {
            return super.startIndex(i);
        }

        @Override // com.amplifyframework.predictions.models.TextFeature.Builder
        public /* bridge */ /* synthetic */ TextFeature.Builder targetText(String str) {
            return super.targetText(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(Object obj) {
            return super.value(obj);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Entity build() {
            return new Entity(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.ENTITY.getAlias();
    }

    private Entity(Builder builder) {
        super(builder);
    }
}
