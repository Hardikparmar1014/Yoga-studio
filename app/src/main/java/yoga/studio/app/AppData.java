package yoga.studio.app;

import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

public class AppData extends Application {
    DBHelper dbHelper;
    @Override
    public void onCreate() {

        super.onCreate();
        dbHelper = new DBHelper(this);
        dbHelper.countCategories();

        if (dbHelper.countCategories() == 0)
        {
            for (Categories categories : init_data())
            {
                dbHelper.insertCategories(categories);
            }

            for (Items items : init_data(this))
            {
                dbHelper.insertItem(items);
            }

        }
    }

    public  static ArrayList<Categories> init_data(){
        ArrayList<Categories> tmp = new ArrayList<>();

        tmp.add(new Categories("Poses For Your Abs",R.drawable.poses_abs_categories,1));
        tmp.add(new Categories("Poses For Your Arms",R.drawable.poses_arm_categories,2));
        tmp.add(new Categories("Poses For Your Hips",R.drawable.poses_hip_categories,3));
        tmp.add(new Categories("Poses For Your Knees",R.drawable.poses_knee_categories,4));
        tmp.add(new Categories("Poses For Your Backs",R.drawable.poses_back_categories,5));
        tmp.add(new Categories("Poses For Your Legs",R.drawable.poses_leg_categories,6));

        return tmp;
    }

    public static ArrayList<Items> init_data(Context context){
        ArrayList<Items> tmp = new ArrayList<>();

        tmp.add(new Items(context.getString(R.string.poses_abs_name_1),
                context.getString(R.string.poses_abs_des_1),
                R.drawable.poses_abs_1, 1,1));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_2),
                context.getString(R.string.poses_abs_des_2),
                R.drawable.poses_abs_2, 1,2));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_3),
                context.getString(R.string.poses_abs_des_3),
                R.drawable.poses_abs_3, 1,3));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_4),
                context.getString(R.string.poses_abs_des_4),
                R.drawable.poses_abs_4, 1,4));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_5),
                context.getString(R.string.poses_abs_des_5),
                R.drawable.poses_abs_5, 1,5));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_6),
                context.getString(R.string.poses_abs_des_6),
                R.drawable.poses_abs_6, 1,6));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_7),
                context.getString(R.string.poses_abs_des_7),
                R.drawable.poses_abs_7, 1,7));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_8),
                context.getString(R.string.poses_abs_des_8),
                R.drawable.poses_abs_8, 1,8));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_9),
                context.getString(R.string.poses_abs_des_9),
                R.drawable.poses_abs_9, 1,9));
        tmp.add(new Items(context.getString(R.string.poses_abs_name_10),
                context.getString(R.string.poses_abs_des_10),
                R.drawable.poses_abs_10, 1,10));

        tmp.add(new Items(context.getString(R.string.poses_arm_name_1),
                context.getString(R.string.poses_arm_des_1),
                R.drawable.poses_arm_1, 2,1));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_2),
                context.getString(R.string.poses_arm_des_2),
                R.drawable.poses_arm_2, 2,2));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_3),
                context.getString(R.string.poses_arm_des_3),
                R.drawable.poses_arm_3, 2,3));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_4),
                context.getString(R.string.poses_arm_des_4),
                R.drawable.poses_arm_4, 2,4));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_5),
                context.getString(R.string.poses_arm_des_5),
                R.drawable.poses_arm_5, 2,5));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_1),
                context.getString(R.string.poses_arm_des_1),
                R.drawable.poses_arm_1, 2,6));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_2),
                context.getString(R.string.poses_arm_des_2),
                R.drawable.poses_arm_2, 2,7));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_3),
                context.getString(R.string.poses_arm_des_3),
                R.drawable.poses_arm_3, 2,8));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_4),
                context.getString(R.string.poses_arm_des_4),
                R.drawable.poses_arm_4, 2,9));
        tmp.add(new Items(context.getString(R.string.poses_arm_name_5),
                context.getString(R.string.poses_arm_des_5),
                R.drawable.poses_arm_5, 2,10));

        tmp.add(new Items(context.getString(R.string.poses_hip_name_1),
                context.getString(R.string.poses_hip_des_1),
                R.drawable.poses_hip_1, 3,1));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_2),
                context.getString(R.string.poses_hip_des_2),
                R.drawable.poses_hip_2, 3,2));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_3),
                context.getString(R.string.poses_hip_des_3),
                R.drawable.poses_hip_3, 3,3));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_4),
                context.getString(R.string.poses_hip_des_4),
                R.drawable.poses_hip_4, 3,4));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_5),
                context.getString(R.string.poses_hip_des_5),
                R.drawable.poses_hip_5, 3,5));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_1),
                context.getString(R.string.poses_hip_des_1),
                R.drawable.poses_hip_1, 3,6));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_2),
                context.getString(R.string.poses_hip_des_2),
                R.drawable.poses_hip_2, 3,7));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_3),
                context.getString(R.string.poses_hip_des_3),
                R.drawable.poses_hip_3, 3,8));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_4),
                context.getString(R.string.poses_hip_des_4),
                R.drawable.poses_hip_4, 3,9));
        tmp.add(new Items(context.getString(R.string.poses_hip_name_5),
                context.getString(R.string.poses_hip_des_5),
                R.drawable.poses_hip_5, 3,10));

        tmp.add(new Items(context.getString(R.string.poses_knee_name_1),
                context.getString(R.string.poses_knee_des_1),
                R.drawable.poses_knee_1, 4,1));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_2),
                context.getString(R.string.poses_knee_des_2),
                R.drawable.poses_knee_2, 4,2));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_3),
                context.getString(R.string.poses_knee_des_3),
                R.drawable.poses_knee_3, 4,3));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_4),
                context.getString(R.string.poses_knee_des_4),
                R.drawable.poses_knee_4, 4,4));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_5),
                context.getString(R.string.poses_knee_des_5),
                R.drawable.poses_knee_5, 4,5));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_1),
                context.getString(R.string.poses_knee_des_1),
                R.drawable.poses_knee_1, 4,6));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_2),
                context.getString(R.string.poses_knee_des_2),
                R.drawable.poses_knee_2, 4,7));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_3),
                context.getString(R.string.poses_knee_des_3),
                R.drawable.poses_knee_3, 4,8));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_4),
                context.getString(R.string.poses_knee_des_4),
                R.drawable.poses_knee_4, 4,9));
        tmp.add(new Items(context.getString(R.string.poses_knee_name_5),
                context.getString(R.string.poses_knee_des_5),
                R.drawable.poses_knee_5, 4,10));

        tmp.add(new Items(context.getString(R.string.poses_back_name_1),
                context.getString(R.string.poses_back_des_1),
                R.drawable.poses_back_1, 5,1));
        tmp.add(new Items(context.getString(R.string.poses_back_name_2),
                context.getString(R.string.poses_back_des_2),
                R.drawable.poses_back_2, 5,2));
        tmp.add(new Items(context.getString(R.string.poses_back_name_3),
                context.getString(R.string.poses_back_des_3),
                R.drawable.poses_back_3, 5,3));
        tmp.add(new Items(context.getString(R.string.poses_back_name_4),
                context.getString(R.string.poses_back_des_4),
                R.drawable.poses_back_4, 5,4));
        tmp.add(new Items(context.getString(R.string.poses_back_name_5),
                context.getString(R.string.poses_back_des_5),
                R.drawable.poses_back_5, 5,5));
        tmp.add(new Items(context.getString(R.string.poses_back_name_1),
                context.getString(R.string.poses_back_des_1),
                R.drawable.poses_back_1, 5,6));
        tmp.add(new Items(context.getString(R.string.poses_back_name_2),
                context.getString(R.string.poses_back_des_2),
                R.drawable.poses_back_2, 5,7));
        tmp.add(new Items(context.getString(R.string.poses_back_name_3),
                context.getString(R.string.poses_back_des_3),
                R.drawable.poses_back_3, 5,8));
        tmp.add(new Items(context.getString(R.string.poses_back_name_4),
                context.getString(R.string.poses_back_des_4),
                R.drawable.poses_back_4, 5,9));
        tmp.add(new Items(context.getString(R.string.poses_back_name_5),
                context.getString(R.string.poses_back_des_5),
                R.drawable.poses_back_5, 5,10));

        tmp.add(new Items(context.getString(R.string.poses_leg_name_1),
                context.getString(R.string.poses_leg_des_1),
                R.drawable.poses_leg_1, 6,1));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_2),
                context.getString(R.string.poses_leg_des_2),
                R.drawable.poses_leg_2, 6,2));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_3),
                context.getString(R.string.poses_leg_des_3),
                R.drawable.poses_leg_3, 6,3));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_4),
                context.getString(R.string.poses_leg_des_4),
                R.drawable.poses_leg_4, 6,4));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_5),
                context.getString(R.string.poses_leg_des_5),
                R.drawable.poses_leg_5, 6,5));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_1),
                context.getString(R.string.poses_leg_des_1),
                R.drawable.poses_leg_1, 6,6));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_2),
                context.getString(R.string.poses_leg_des_2),
                R.drawable.poses_leg_2, 6,7));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_3),
                context.getString(R.string.poses_leg_des_3),
                R.drawable.poses_leg_3, 6,8));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_4),
                context.getString(R.string.poses_leg_des_4),
                R.drawable.poses_leg_4, 6,9));
        tmp.add(new Items(context.getString(R.string.poses_leg_name_5),
                context.getString(R.string.poses_leg_des_5),
                R.drawable.poses_leg_5, 6,10));


        return tmp;
    }


}
