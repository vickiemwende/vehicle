package com.example.vehicle_breakdownapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView

class CustomAdapterActivity(var context: Context, var data:ArrayList<MechanicActivity>):BaseAdapter() {
    private class ViewHolder(row:View?){


        //step 1 declare your textviews
        var txtlocation:TextView
        var txtservice:TextView
        var txtprice:TextView
        var btn_update:Button
        var btn_delete:Button

        init {

            //step 2 find views by ID
            this.txtlocation = row?.findViewById(R.id.mTvlocation) as TextView
            this.txtservice = row?.findViewById(R.id.mTvservice) as TextView
            this.txtprice = row?.findViewById(R.id.mTvprice) as TextView
            this.btn_update = row?.findViewById(R.id.btnUpdate) as Button
            this.btn_delete = row?.findViewById(R.id.btnDelete) as Button

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.servicerecordlayout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:MechanicActivity = getItem(position) as MechanicActivity
        viewHolder.txtlocation.text = item.location  //coming from your model
        viewHolder.txtservice.text = item.service
        viewHolder.txtprice.text = item.price

        viewHolder.btn_update.setOnClickListener {

            //grab data and pass as PutEXTRA
            // var intent = Intent(context, UpdateCar_Record::class.java)

            //intent.putExtra("car_make", item.car_make)
            // intent.putExtra("car_model", item.car_model)
            // intent.putExtra("car_price", item.car_price)
            //intent.putExtra("car_id", item.car_id)

            //context.startActivity(intent)


            // var ref = FirebaseDatabase.getInstance().getReference().child("cars/"+item.car_id)

        }

        viewHolder.btn_delete.setOnClickListener {

            // var ref = FirebaseDatabase.getInstance().getReference().child("cars/"+item.car_id)

            //toast a message to delete item
            // ref.removeValue().addOnCompleteListener {
            //if (it.isSuccessful) {

            //  Toast.makeText(context, "Item has been Deleted", Toast.LENGTH_SHORT).show()
            //  } else {
            //  Toast.makeText(context, "Failed to delete item", Toast.LENGTH_SHORT).show()
            //  }

            //}

        }


        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}