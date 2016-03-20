using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        bool plus, minus, umn, del,power,zap;

        public Form1()
        {

            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.Form1_KeyDown);
            InitializeComponent();
        }

       

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            switch (e.KeyCode)
            {

                case Keys.Enter:
                    double res;
                    zap = false;

                    if (plus)
                    {
                        res = Convert.ToDouble(result.Tag) + Convert.ToDouble(result.Text);
                        result.Text = Convert.ToString(res);
                        plus = false;
                    }
                    else if (minus)
                    {
                        res = Convert.ToDouble(result.Tag) - Convert.ToDouble(result.Text);
                        result.Text = Convert.ToString(res);
                        minus = false;
                    }
                    else if (umn)
                    {
                        res = Convert.ToDouble(result.Tag) * Convert.ToDouble(result.Text);
                        result.Text = Convert.ToString(res);
                        umn = false;
                    }
                    else if (del)
                    {
                        res = Convert.ToDouble(result.Tag) / Convert.ToDouble(result.Text);
                        result.Text = Convert.ToString(res);
                        del = false;
                    }
                    else if (power)
                    {
                        res = Math.Pow(Convert.ToDouble(result.Tag), Convert.ToDouble(result.Text));
                        result.Text = Convert.ToString(res);
                        power = false;
                    }
                    break;
                case Keys.D0:
                case Keys.NumPad0:
                    result.Text = result.Text + "0";
                    break;
                case Keys.D1:
                case Keys.NumPad1:
                    result.Text = result.Text + "1";
                    break;
                case Keys.D2:
                case Keys.NumPad2:
                    result.Text = result.Text + "2";
                    break;
                case Keys.D3:
                case Keys.NumPad3:
                    result.Text = result.Text + "3";
                    break;
                case Keys.D4:
                case Keys.NumPad4:
                    result.Text = result.Text + "4";
                    break;
                case Keys.D5:
                case Keys.NumPad5:
                    result.Text = result.Text + "5";
                    break;
                case Keys.D6:
                case Keys.NumPad6:
                    result.Text = result.Text + "6";
                    break;
                case Keys.D7:
                case Keys.NumPad7:
                    result.Text = result.Text + "7";
                    break;
                case Keys.D8:
                case Keys.NumPad8:
                    result.Text = result.Text + "8";
                    break;
                case Keys.D9:
                case Keys.NumPad9:
                    result.Text = result.Text + "9";
                    break;
                case Keys.Subtract:
                    minus = true;
                    result.Tag = result.Text;
                    result.Text = "";
                    zap = false;

                    break;
                case Keys.Add:
                    plus = true;
                    result.Tag = result.Text;
                    result.Text = "";
                    zap = false;

                    break;
                case Keys.Multiply:
                    umn = true;
                    result.Tag = result.Text;
                    result.Text = "";
                    zap = false;

                    break;
                case Keys.Divide:
                    del = true;
                    result.Tag = result.Text;
                    result.Text = "";
                    zap = false;

                    break;
                case Keys.Decimal:
                    if (!zap)
                    {
                        result.Text = result.Text + ",";
                        zap = true;
                    }
                    break;
            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "6";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "2";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            minus = true;
            result.Tag = result.Text;
            result.Text = "";
            zap = false;

        }

        private void button5_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "1";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "3";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "4";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "5";
        }

        private void button10_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "0";
        }

        private void button14_Click(object sender, EventArgs e)
        {
            plus = true;
            zap = false;
            result.Tag = result.Text;
            result.Text = "";
        }

        private void button15_Click(object sender, EventArgs e)
        {
            double res;
            zap = false;

            if (plus) {
                res = Convert.ToDouble(result.Tag) + Convert.ToDouble(result.Text);
                result.Text = Convert.ToString(res);
                plus = false;
            } 
            else if (minus)
            {
                res = Convert.ToDouble(result.Tag) - Convert.ToDouble(result.Text);
                result.Text = Convert.ToString(res);
                minus = false;
            }
            else if (umn)
            {
                res = Convert.ToDouble(result.Tag) * Convert.ToDouble(result.Text);
                result.Text = Convert.ToString(res);
                umn = false;
            }
            else if (del)
            {
                res = Convert.ToDouble(result.Tag) / Convert.ToDouble(result.Text);
                result.Text = Convert.ToString(res);
                del = false;
            }
            else if (power)
            {
                res = Math.Pow(Convert.ToDouble(result.Tag), Convert.ToDouble(result.Text));
                result.Text = Convert.ToString(res);
                power = false;
            }
        }

        private void button11_Click(object sender, EventArgs e)
        {
            del = true;
            result.Tag = result.Text;
            result.Text = "";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            umn = true;
            result.Tag = result.Text;
            result.Text = "";
        }

        private void button16_Click(object sender, EventArgs e)
        {
            if (!zap)
            {
                result.Text = result.Text + ",";
                zap = true;
            }
        }

        private void button17_Click(object sender, EventArgs e)
        {
            double tmp = Convert.ToDouble(result.Text) * -1;
            result.Text = Convert.ToString(tmp);
            zap = false;

        }

        private void button19_Click(object sender, EventArgs e)
        {
            result.Text = (Convert.ToString(Math.Sqrt(Convert.ToDouble(result.Text))));
            zap = false;

        }

        private void button20_Click(object sender, EventArgs e)
        {
            result.Text = "";
            result.Tag = "";
            zap = false;

        }

        private void button18_Click(object sender, EventArgs e)
        {
            power = true;
            result.Tag = result.Text;
            result.Text = "";
            zap = false;

        }

        private void button2_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "7";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "8";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            result.Text = result.Text + "9";
        }

        
    }
}
