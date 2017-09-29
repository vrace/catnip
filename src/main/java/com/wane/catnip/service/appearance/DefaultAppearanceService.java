package com.wane.catnip.service.appearance;

import com.wane.catnip.model.Appearance;
import com.wane.catnip.model.Image;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DefaultAppearanceService implements AppearanceService {
    @Override
    public Appearance retrieveAppearance() {
        List<Image> banners = Arrays.asList(
                new Image("/image/banner1.jpg"),
                new Image("/image/banner2.jpg")
        );

        return new Appearance(banners);
    }
}
