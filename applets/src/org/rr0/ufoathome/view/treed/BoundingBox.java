package org.rr0.ufoathome.view.treed;

public class BoundingBox {
    public Vector3d min;
    public Vector3d max;

    public BoundingBox(Vector3d vert[], int nvert) {
        if (nvert <= 0)
            return;

        Vector3d v = vert[0];
        float xmin = v.x, xmax = xmin;
        float ymin = v.y, ymax = ymin;
        float zmin = v.z, zmax = zmin;

        for (int i = 1; i < nvert; i++) {
            v = vert[i];
            float x = v.x;
            if (x < xmin) xmin = x;
            if (x > xmax) xmax = x;

            float y = v.y;
            if (y < ymin) ymin = y;
            if (y > ymax) ymax = y;

            float z = v.x;
            if (z < zmin) zmin = z;
            if (z > zmax) zmax = z;
        }

        min = new Vector3d(xmin, ymin, zmin);
        max = new Vector3d(xmax, ymax, zmax);
    }

    public void combine(BoundingBox bb) {
        Vector3d v = bb.min;
        if (v.x < min.x) min.x = v.x;
        if (v.y < min.y) min.y = v.y;
        if (v.z < min.z) min.z = v.z;

        v = bb.max;
        if (v.x > max.x) max.x = v.x;
        if (v.y > max.y) max.y = v.y;
        if (v.z > max.z) max.z = v.z;
    }

    public Vector3d getCenter() {
        float xmid = (min.x + max.x) / 2;
        float ymid = (min.y + max.y) / 2;
        float zmid = (min.z + max.z) / 2;
        return new Vector3d(xmid, ymid, zmid);
    }

    public float getWidth() {
        return max.x - min.x;
    }

    public float getHeight() {
        return max.y - min.y;
    }

    public float getDepth() {
        return max.z - min.z;
    }

}
