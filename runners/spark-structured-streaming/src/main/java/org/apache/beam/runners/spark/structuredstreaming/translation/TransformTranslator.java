package org.apache.beam.runners.spark.structuredstreaming.translation;

import org.apache.beam.sdk.transforms.PTransform;

public interface TransformTranslator<TransformT extends PTransform> {

  /** Base class for translators of {@link PTransform}. */

  void translateTransform(TransformT transform, TranslationContext context);
  }
