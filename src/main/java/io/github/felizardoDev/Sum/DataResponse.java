package io.github.felizardoDev.Sum;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DataResponse<T> {

    @JsonProperty("resultado")
    public T result;
}
