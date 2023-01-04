package com.eslammongy.asteroidradar.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u0011"}, d2 = {"bindAsteroidStatusImage", "", "imageView", "Landroid/widget/ImageView;", "isHazardous", "", "bindDetailsStatusImage", "bindPictureOfDayImage", "pictureOfDay", "Lcom/eslammongy/asteroidradar/domain/PictureOfDay;", "bindTextViewToAstronomicalUnit", "textView", "Landroid/widget/TextView;", "number", "", "bindTextViewToDisplayVelocity", "bindTextViewToKmUnit", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"pictureOfDay"})
    public static final void bindPictureOfDayImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    com.eslammongy.asteroidradar.domain.PictureOfDay pictureOfDay) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"statusIcon"})
    public static final void bindAsteroidStatusImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, boolean isHazardous) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"asteroidStatusImage"})
    public static final void bindDetailsStatusImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, boolean isHazardous) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"astronomicalUnitText"})
    public static final void bindTextViewToAstronomicalUnit(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"kmUnitText"})
    public static final void bindTextViewToKmUnit(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"velocityText"})
    public static final void bindTextViewToDisplayVelocity(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, double number) {
    }
}