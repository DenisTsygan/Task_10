package com.example.task_10;

import java.util.ArrayList;
import java.util.List;

public class Pyramids {
    private List<RightPyramid> pyramids;

    public Pyramids() {
        pyramids = new ArrayList<>();
    }

    public void add(RightPyramid pyramid) {
        pyramids.add(pyramid);
    }

    public RightPyramid get_pyramid_max_volume() {
        double max_volume = pyramids.get(0).getVolume();
        RightPyramid result = pyramids.get(0);
        for (RightPyramid pyramid : pyramids) {
            if (pyramid.getVolume() > max_volume) {
                max_volume = pyramid.getVolume();
                result = pyramid;
            }
        }
        return result;
    }

    public List<RightPyramid> getPyramids(){
        return pyramids;
    }
    @Override
    public String toString() {
        return "Pyramids{" + pyramids +
                '}';
    }
}
